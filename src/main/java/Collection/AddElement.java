package Collection;

/*
необходимо реализовать метод,
который добавляет элемент в список и сообщает нам удалось это или нет, т.е. метод должен вернуть булево значение.
 */

import java.util.List;

public class AddElement {
    public static void main(String[] args) {

    }

    public static boolean addNewElement(List<String> list, String str) {

        int size = list.size();
        list.add(str);
        if (size < list.size()) {
            return true;
        }
        return false;
    }

}
