package hu.petrik.EmberekOOP;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Emberek {
    private List<Ember> emberekList= new List<Ember>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Ember> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Ember ember) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Ember> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Ember> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Ember get(int index) {
            return null;
        }

        @Override
        public Ember set(int index, Ember element) {
            return null;
        }

        @Override
        public void add(int index, Ember element) {

        }

        @Override
        public Ember remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Ember> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Ember> listIterator(int index) {
            return null;
        }

        @Override
        public List<Ember> subList(int fromIndex, int toIndex) {
            return null;
        }
    };

    public Emberek(Ember emberObj) {
        emberekList.add(emberObj);
    }

    public Emberek(Ember[] emberArr){
        for (int i = 0; i < emberArr.length; i++) {
            emberekList.add(emberArr[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < emberekList.size(); i++) {
            sb.append(emberekList.get(i).toString()).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
