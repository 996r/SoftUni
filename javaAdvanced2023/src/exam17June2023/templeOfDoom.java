package exam17June2023;

import java.util.*;
import java.util.stream.Collectors;

public class templeOfDoom {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayDeque <Integer> toolsQue = new ArrayDeque<>();
        ArrayDeque <Integer> substancesStack = new ArrayDeque<>();
        List<Integer> challenge = new ArrayList<>();
        Arrays.stream(keyboard.nextLine().split("\\s+"))
                .map(Integer::parseInt).forEach(toolsQue::add);
        Arrays.stream(keyboard.nextLine().split("\\s+"))
                .map(Integer::parseInt).forEach(substancesStack::push);
        Arrays.stream(keyboard.nextLine().split("\\s+"))
                .map(Integer::parseInt).forEach(challenge::add);
        int c = 0;
while( substancesStack.size() >= 0 || challenge.size() >= 0 ){
    int tool = toolsQue.peek();
    int substance = substancesStack.peek();
    if( challenge.contains(tool * substance)){
        c++;
        for (int i = 0; i < challenge.size() ; i++) {
            toolsQue.poll();
            substancesStack.pop();
            if(challenge.get(i) == (tool * substance)) {
                challenge.remove(i);
                break;
            }
        }
    } else  if(!challenge.contains(tool * substance)){
        tool = toolsQue.peek();
        tool ++;
        toolsQue.poll();
        toolsQue.add(tool);

        substance = substancesStack.peek();
        substance --;
        substancesStack.pop();
        if(substance <= 0 ) {


        } else {
            substancesStack.offer(substance);
        }
    } else if (substancesStack.size() <= 0 && challenge.size() >= 1) {
        System.out.println("Harry is lost in the temple. Oblivion awaits him.");
    } else if (c == challenge.size()) {
        System.out.println("Harry found an ostracon, which is dated to the 6th century BCE.");
    }
}

    }
}
