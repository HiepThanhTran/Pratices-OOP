public class Test {

    public static void main(String[] args) {
        StateContext context = new StateContext();

        context.writeName("Monday");
        context.writeName("Tuesday");
        context.writeName("Wednesday");
        context.writeName("Thursday");
        context.writeName("Friday");
        context.writeName("Saturday");
        context.writeName("Sunday");
    }

    interface State {

        void writeName(StateContext context, String name);
    }

    static class LowerCaseState implements State {

        @Override
        public void writeName(StateContext context, String name) {
            System.out.println(name.toLowerCase());
            context.setState(new MultipleUpperCaseState());
        }
    }

    static class MultipleUpperCaseState implements State {

        /* Counter local to this state */
        private int count = 0;

        @Override
        public void writeName(StateContext context, String name) {
            System.out.println(name.toUpperCase());
            /* Change state after StateMultipleUpperCase's writeName() gets invoked twice */
            if (++count > 1) {
                context.setState(new LowerCaseState());
            }
        }
    }

    static class StateContext {

        private State state;

        public StateContext() {
            state = new LowerCaseState();
        }

        /**
         * Set the current state. Normally only called by classes implementing the State interface.
         *
         * @param newState the new state of this context
         */
        void setState(State newState) {
            state = newState;
        }

        public void writeName(String name) {
            state.writeName(this, name);
        }
    }
}
