public abstract class GameAI {
    public void turn() {
        collectResources();
        buildStructures();
        buildUnits();
        attack();
    }
    public void attack() {
        System.out.println("Game AI attacks!");
    }
    public abstract void buildUnits();
    public abstract void buildStructures();
    public void collectResources() {
        System.out.println("Game AI collects resources!");
    }
}
