package com.curso.domains.enums;

public enum ConsultationPriority {
    LOW(0, "ROLE_LOW"),MEDIUM(1,"ROLE_MEDIUM"),HIGH(2,"ROLE_HIGH");

    private Integer id;
    private String consultationPriority;
   
    private ConsultationPriority(Integer id, String consultationPriority) {
        this.id = id;
        this.consultationPriority = consultationPriority;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConsultationPriority() {
        return consultationPriority;
    }

    public void setConsultationPriority(String consultationPriority) {
        this.consultationPriority = consultationPriority;
    }

    public static ConsultationPriority toEnum(Integer id){
        if(id==null) return null;
        for(ConsultationPriority x : ConsultationPriority.values()){
            if(id.equals(x.getId())){
                return x;
            }
        }
        throw new IllegalArgumentException("Perfil Inválido");
    }
}
