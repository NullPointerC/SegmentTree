package cn.homyit.segtree;

public interface Merger<E> {
	E merge(E a, E b);
}
