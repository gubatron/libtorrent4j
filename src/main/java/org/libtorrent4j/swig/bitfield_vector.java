/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libtorrent4j.swig;

public class bitfield_vector extends java.util.AbstractList<bitfield> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected bitfield_vector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(bitfield_vector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_bitfield_vector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public bitfield_vector(bitfield[] initialElements) {
    this();
    reserve(initialElements.length);

    for (bitfield element : initialElements) {
      add(element);
    }
  }

  public bitfield_vector(Iterable<bitfield> initialElements) {
    this();
    for (bitfield element : initialElements) {
      add(element);
    }
  }

  public bitfield get(int index) {
    return doGet(index);
  }

  public bitfield set(int index, bitfield e) {
    return doSet(index, e);
  }

  public boolean add(bitfield e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, bitfield e) {
    modCount++;
    doAdd(index, e);
  }

  public bitfield remove(int index) {
    modCount++;
    return doRemove(index);
  }

  protected void removeRange(int fromIndex, int toIndex) {
    modCount++;
    doRemoveRange(fromIndex, toIndex);
  }

  public int size() {
    return doSize();
  }

  public bitfield_vector() {
    this(libtorrent_jni.new_bitfield_vector__SWIG_0(), true);
  }

  public bitfield_vector(bitfield_vector other) {
    this(libtorrent_jni.new_bitfield_vector__SWIG_1(bitfield_vector.getCPtr(other), other), true);
  }

  public long capacity() {
    return libtorrent_jni.bitfield_vector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    libtorrent_jni.bitfield_vector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return libtorrent_jni.bitfield_vector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    libtorrent_jni.bitfield_vector_clear(swigCPtr, this);
  }

  public bitfield_vector(int count, bitfield value) {
    this(libtorrent_jni.new_bitfield_vector__SWIG_2(count, bitfield.getCPtr(value), value), true);
  }

  private int doSize() {
    return libtorrent_jni.bitfield_vector_doSize(swigCPtr, this);
  }

  private void doAdd(bitfield x) {
    libtorrent_jni.bitfield_vector_doAdd__SWIG_0(swigCPtr, this, bitfield.getCPtr(x), x);
  }

  private void doAdd(int index, bitfield x) {
    libtorrent_jni.bitfield_vector_doAdd__SWIG_1(swigCPtr, this, index, bitfield.getCPtr(x), x);
  }

  private bitfield doRemove(int index) {
    return new bitfield(libtorrent_jni.bitfield_vector_doRemove(swigCPtr, this, index), true);
  }

  private bitfield doGet(int index) {
    return new bitfield(libtorrent_jni.bitfield_vector_doGet(swigCPtr, this, index), false);
  }

  private bitfield doSet(int index, bitfield val) {
    return new bitfield(libtorrent_jni.bitfield_vector_doSet(swigCPtr, this, index, bitfield.getCPtr(val), val), true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    libtorrent_jni.bitfield_vector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
