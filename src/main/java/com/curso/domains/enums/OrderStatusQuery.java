package com.curso.domains.enums;

public enum OrderStatusQuery {
    OPEN(0, "ROLE_OPEN"),PROGRESS(1,"ROLE_PROGRESS"),CLOSED(2,"ROLE_CLOSED");

    private Integer id;
    private String orderStatusQuery;
    
    private OrderStatusQuery(Integer id, String orderStatusQuery) {
        this.id = id;
        this.orderStatusQuery = orderStatusQuery;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderStatusQuery() {
        return orderStatusQuery;
    }

    public void setOrderStatusQuery(String orderStatusQuery) {
        this.orderStatusQuery = orderStatusQuery;
    }

    public static OrderStatusQuery toEnum(Integer id){
        if(id==null) return null;
        for(OrderStatusQuery x : OrderStatusQuery.values()){
            if(id.equals(x.getId())){
                return x;
            }
        }
        throw new IllegalArgumentException("Perfil Inválido");
    }
}
