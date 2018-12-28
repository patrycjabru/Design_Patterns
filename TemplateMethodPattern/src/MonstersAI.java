public class MonstersAI extends GameAI {
    @Override
    public void collectResources() {
        System.out.println("Monsters don't collect resources!");
    }


    @Override
    public void buildUnits() {
        System.out.println("Monsters don't build units!");
    }

    @Override
    public void buildStructures() {
        System.out.println("Monsters don't build structures!");
    }
}
