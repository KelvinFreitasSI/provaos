package com.curso.domains.enums;

public enum DoctorType {

    ADMIN(0, "ROLE_ADMINS"), USERS(1,"ROLE_USERS");

    private Integer id;
    private String doctorType;
    

    private DoctorType(Integer id, String doctorType) {
        this.id = id;
        this.doctorType = doctorType;
    }



    public Integer getId() {
        return id;
    }



    public void setId(Integer id) {
        this.id = id;
    }



    public String getDoctorType() {
        return doctorType;
    }



    public void setDoctorType(String doctorType) {
        this.doctorType = doctorType;
    }



    public static DoctorType toEnum(Integer id){
        if(id==null) return null;
        for(DoctorType x : DoctorType.values()){
            if(id.equals(x.getId())){
                return x;
            }
        }
        throw new IllegalArgumentException("Perfil inválido");
    }
}
