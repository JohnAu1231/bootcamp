import java.util.Comparator;

public class IncOrdEven implements Comparator<Integer> {

  @Override
public int compare(Integer i1, Integer i2) {
  if (i1 % 2 == 0 & i2 %2 != 0) 
    return -1;
  if (i1 % 2 != 0 & i2 %2 == 0 )
    return 1;
  if (i1 < i2) 
      return -1;
  return 1;
  }
}
