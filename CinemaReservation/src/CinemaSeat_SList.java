/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class CinemaSeat_SList<E> {
    private CinemaSeat_SNode<E> header, trailer;
    private int size;
    
    public CinemaSeat_SList(){
        trailer = new CinemaSeat_SNode<>(null, null, null);
        header = new CinemaSeat_SNode<>(null, null, trailer);
        trailer.setPrev(header);
    }
    
    public void addFirst(E costumer){
        addBetween(header, costumer, header.getNext());
    }
    
    public void addLast(E costumer){
        addBetween(trailer.getPrev(), costumer, trailer);
    }
    
    private void addBetween(CinemaSeat_SNode<E> prev, E Costumer, CinemaSeat_SNode<E> next){
        CinemaSeat_SNode<E> newNode = new CinemaSeat_SNode<>(prev, Costumer, next);
        prev.setNext(newNode);
        next.setPrev(newNode);
        size++;
    }
    
    private E remove(CinemaSeat_SNode<E> node){
        E temp = node.getCostumer();
        node.getPrev().setNext(node.getNext());
        node.getNext().setPrev(node.getPrev());
        size--;
        node.setNext(null);
        node.setPrev(null);
        return temp;
    }
    
    public E removeFirst(){
        return remove(header.getNext());
    }
    
    public E removeLast(){
        return remove(trailer.getPrev());
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public E first(){
        return header.getNext().getCostumer();
    }
    
    public E last(){
        return trailer.getPrev().getCostumer();
    }
    public void showList() {
//        System.out.print(head.getElement());
//        System.out.print(head.getNext().getElement());
//        System.out.print(head.getNext().getNext().getElement());
//        
        CinemaSeat_SNode temp = header.getNext();
        for (int i = 0; i < size; i++) {
            System.out.print("Task : " + temp.getCostumer()+"\n");
            temp = temp.getNext();
        }
        
    }
}
