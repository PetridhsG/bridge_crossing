
import java.util.ArrayList;
import java.util.Collections;

public class MoveSearcher {

    // this method implements the A* algorithm
    public static State AStar(State initialState){

        ArrayList<State> states = new ArrayList<State>();
        states.add(initialState);   // add the initial state to the search front

        if(initialState.isFinal()){     // if the state is final return the state
            return initialState;
        }

        while(!states.isEmpty()){                   // while there is a state in search front
            Collections.sort(states);              // sort by ascending order based on F score
            State state = states.remove(0); // remove from the front the state with the least F score
            if (state.isFinal()){                // if the state is final return the state
                return state;
            }
            states.addAll(state.getChildren());  // add all children of the current state in the search front
        }
        return null;
     }

}
