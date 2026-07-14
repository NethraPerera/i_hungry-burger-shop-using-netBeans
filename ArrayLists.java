package i_hungry;

import i_hungry.Customers;

public class ArrayLists {
    // public static Customers [] customerList=new Customers[0];
    // public static Orders [] orderList=new Orders[0];

    public static NodeCustomers firstCustomer;
    public static NodeOders firstOder;

    public static int currentCustomerID = 0;
    public static int currentOrderID = 0;

    ArrayLists() {
    }

    // public void addLastCustomer(Customers customer){
    // extendCustomerList();
    // customerList[customerList.length-1]=customer;
    // }

    // public void extendCustomerList(){
    // Customers []tempCustomerList=new Customers[customerList.length+1];
    // for (int i = 0; i < customerList.length; i++) {
    // tempCustomerList[i]=customerList[i];
    // }
    // customerList=tempCustomerList;
    // }

    // // --------------------------------------------------------------------------
    // public void addLastOrder(Orders order){
    // extendOrderList();
    // orderList[orderList.length-1]=order;
    // }
    // public void extendOrderList(){
    // Orders []tempOrderList=new Orders[orderList.length+1];
    // for (int i = 0; i < orderList.length; i++) {
    // tempOrderList[i]=orderList[i];
    // }
    // orderList=tempOrderList;
    // }

    // --------------------------------------------------------------------------
    public void addLast(i_hungry.Customers customer) {
        if (firstCustomer == null) {
            firstCustomer = new NodeCustomers(customer);
        } else {
            NodeCustomers n1 = new NodeCustomers(customer);
            NodeCustomers temp = firstCustomer;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n1;
        }
    }

    public void addLast(i_hungry.Orders order) {
        if (firstOder == null) {
            firstOder = new NodeOders(order);
        } else {
            NodeOders n1 = new NodeOders(order);
            NodeOders temp = firstOder;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n1;
        }
    }

    // --------------------------------------------------------------------------
    public int sizeCustomers() {
        int count = 0;
        NodeCustomers temp = firstCustomer;
        if (firstCustomer == null) {
            return 0;
        } else {
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public boolean isEmptyCustomers() {
        return firstCustomer == null;
    }
    public NodeCustomers getLastCustomer(){
        NodeCustomers temp=firstCustomer;
        if (sizeCustomers()!=0) {
            while (temp.next!=null) {
                temp=temp.next;
            }
        }
        return temp;
    }
    // --------------------------------------------------------------------------
    public int sizeOrders() {
        int count = 0;
        NodeOders temp = firstOder;
        if (firstOder == null) {
            return 0;
        } else {
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public boolean isEmptyOrders() {
        return firstOder == null;
    }

    // ------------------------ inner classes ---------------------------------
    class NodeCustomers {
        i_hungry.Customers customer;
        NodeCustomers next;

        NodeCustomers(i_hungry.Customers customer) {
            this.customer = customer;
        }
    }

    class NodeOders {
        i_hungry.Orders order;
        NodeOders next;

        NodeOders(i_hungry.Orders order) {
            this.order = order;
        }
    }
}
