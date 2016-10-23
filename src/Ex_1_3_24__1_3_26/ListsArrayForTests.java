package Ex_1_3_24__1_3_26;

import java.lang.reflect.Array;

/**
 * Created by vl on 22.10.16.
 */
class ListsArrayForTests {
    private LinkedListStack<String>[] listsArray;

    @SuppressWarnings("unchecked")
    ListsArrayForTests(int arraySize) {
        listsArray = new LinkedListStack[arraySize];

        for (int i = 0; i < listsArray.length; i++) {
            listsArray[i] = new LinkedListStack<>();

            String[] listArgs = {"five", "four", "three", "two", "one", };

            for (String j : listArgs) {
                listsArray[i].push(j);
            }
        }
    }

    LinkedListStack<String> getList(int listIndex) {
        return listsArray[listIndex];
    }
}
