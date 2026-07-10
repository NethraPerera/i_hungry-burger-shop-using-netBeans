class Orders {
    private String orderId;
    private int QTY;
    private String status;
    private double netTotal;

    Orders() {
    }

    Orders(String orderId,int QTY,String status,double netTotal){
        setOrderId( orderId);
        setQTY( QTY);
        setStatus( status);
        setNetTotal(netTotal);
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setQTY(int QTY) {
        this.QTY = QTY;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNetTotal(double netTotal) {
        this.netTotal = netTotal;
    }
    public String getOrderId() {
        return this.orderId;
    }
    public String getQTY() {
        return this.QTY;
    }
    public String getStatus() {
        return this.status;
    }
    public String getNetTotal() {
        return this.netTotal;
    }
}
