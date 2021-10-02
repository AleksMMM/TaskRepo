package Collection;

import java.util.ArrayList;
import java.util.List;
/*
необходимо реализовать метод, который добавляет элемент в список по индексу,
при этом он должен добавлять элемент только в том случае, если этого элемента еще нет в коллекции.
При этом метод должен вернуть булево значение.
 */

public class AddIndexElement {

    public static boolean addNewElement(List<String> list, int index, String str) {
        List<String> check = new ArrayList<>(list);
        if (!check.contains(str)) {
            check.add(index, str);
            return true;
        }
        return false;

    }
}
