public class Pc implements Game {

    @Override
    public Action createAction() {
        System.out.println("Creat a PC Action Game");
        return new PcAction();
    }

    @Override
    public Adventure createAdventure() {
        System.out.println("Creat a PC Adventure Game");
        return new PcAdventure();
    }

}
