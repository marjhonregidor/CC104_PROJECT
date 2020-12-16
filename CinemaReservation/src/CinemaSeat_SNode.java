/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 * @param <E>
 */
public class CinemaSeat_SNode<E>{
    private CinemaSeat_SNode<E> prev;
    private E costumer;
    private CinemaSeat_SNode<E> next;

    public CinemaSeat_SNode(CinemaSeat_SNode<E> prev, E costumer, CinemaSeat_SNode<E> next){
        this.prev = prev;
        this.costumer = costumer;
        this.next = next;
    }
    
    public CinemaSeat_SNode<E> getPrev() {
        return prev;
    }

    public void setPrev(CinemaSeat_SNode<E> prev) {
        this.prev = prev;
    }
    
    public E getCostumer() {
        return costumer;
    }

    public void setCostumer(E costumer) {
        this.costumer = costumer;
    }

    public CinemaSeat_SNode<E> getNext() {
        return next;
    }

    public void setNext(CinemaSeat_SNode<E> next) {
        this.next = next;
    } 
}
