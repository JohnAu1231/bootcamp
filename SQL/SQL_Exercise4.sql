create table players (
    player_id integer not null unique, 
    group_id integer not null
);
DROP TABLE matches;
create table matches (
    match_id integer not null unique, 
    first_player integer not null, 
    second_player integer not null, 
    first_score integer not null, 
    second_score integer not null
);

INSERT INTO players VALUES
(20,2),
(30,1),
(40,3),
(45,1),
(50,2),
(65,1);

SELECT * FROM players;
SELECT * FROM matches;
DROP TABLE matches;
INSERT INTO matches VALUES
(1,30,45,10,12),
(2,20,50,5,5),
(13,65,45,10,10),
(5,30,65,3,15),
(42,45,65,8,4);

-- select each player's score in each match
WITH scores AS (
	SELECT p.group_id, m.first_player AS player_id, m.first_score AS score
	FROM matches m LEFT JOIN players p ON m.first_player = p.player_id
	UNION ALL
	SELECT p.group_id, m.second_player AS player_id, m.second_score AS score
	FROM matches m LEFT JOIN players p ON m.second_player = p.player_id
),
	-- select the total scores in all matches of player , with player who has not record
totalscores AS(
	SELECT SUM(s.score) AS total_score, s.player_id, s.group_id
	FROM scores s
	GROUP BY s.player_id, s.group_id
	UNION
	SELECT '0' AS total_score, p.player_id, p.group_id
	From players p 
	WHERE NOT EXISTS (SELECT s.player_id FROM scores s WHERE p.player_id = s.player_id)
) ,
	-- select the player who has the maximum total score in each group, if scores are same, select the samller player_id
	maxs AS(
	SELECT DISTINCT ON (p.group_id) p.group_id , COALESCE(t.total_score, 0), p.player_id
	FROM players p LEFT JOIN totalscores t ON p.player_id =t.player_id
	ORDER BY group_id, total_score DESC, player_id ASC
)
-- select the group_id and winner in each group, order by group_id ASC
SELECT  p.group_id, t.player_id
FROM  players p LEFT JOIN totalscores t ON t.player_id = p.player_id
WHERE p.player_id IN (SELECT player_id FROM maxs)
ORDER BY p.group_id ASC;
