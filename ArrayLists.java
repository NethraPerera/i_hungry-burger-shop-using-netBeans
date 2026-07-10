public class ArrayLists {
    public static Customers [] customerList=new Customers[0];
    public static Orders [] orderList=new Orders[0];

    public static int currentCustomerID=0;
    public static int currentOrderID=0;
    ArrayLists(){}
    public void addLastCustomer(Customers customer){
        extendCustomerList();
        customerList[customerList.length-1]=customer;
    }
    public void extendCustomerList(){
        Customers []tempCustomerList=new Customers[customerList.length+1]
        for (int i = 0; i < customerList.length; i++) {
            tempCustomerList[i]=customerList[i];
        }
        customerList=tempCustomerList;
    }

    //  --------------------------------------------------------------------------
    public void addLastOrder(Orders order){
        extendOrderList();
        orderList[orderList.length-1]=order;
    }
    public void extendOrderList(){
        Orders []tempOrderList=new Orders[orderList.length+1];
        for (int i = 0; i < orderList.length; i++) {
            tempOrderList[i]=orderList[i];
        }
        orderList=tempOrderList;
    }
}
