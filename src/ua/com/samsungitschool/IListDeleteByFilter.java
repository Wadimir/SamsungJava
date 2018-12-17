package ua.com.samsungitschool;

import java.util.List;

public interface IListDeleteByFilter<T> {
    List<T> deleteFromList(List<T> list, T deleteFilterKey);
}
