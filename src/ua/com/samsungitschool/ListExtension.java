package ua.com.samsungitschool;

import java.util.List;

public class ListExtension implements IListDeleteByFilter<Integer> {

    @Override
    public List<Integer> deleteFromList(List<Integer> list, Integer deleteFilterKey) {
        for (int i = 0; i < list.size(); i++) {
            if (deleteFilterKey == list.get(i)) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }
}