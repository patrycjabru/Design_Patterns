public class Originator {
    private String state;

    public void set(String state) {
        this.state = state;
    }

    public Memento save() {
        System.out.println("Creating new Memento from state "+state);
        return new Memento(state);
    }

    public void restore(Memento memento) {
        state = memento.state;
        System.out.println("Restoring state: "+state);
    }

    public static class Memento {
        private String state;

        public Memento(String stateToSave) {
            state = stateToSave;
        }
    }
}
