package com.curso.domains;

import java.time.LocalDate;
import java.util.UUID;

import com.curso.domains.enums.ConsultationPriority;
import com.curso.domains.enums.OrderStatusQuery;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "serviceorderhosp")
public class ServiceOrderHosp {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate startDate = LocalDate.now();

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate endDate;
    private String titleOS;
    private String description;
    private OrderStatusQuery orderStatusQuery;
    private ConsultationPriority consultationPriority;

    @ManyToOne // relaçao de muitos para um
    @JoinColumn(name = "iduser")// refere-se ao id 
    private Users user;
    
    public ServiceOrderHosp() {

    }

    public ServiceOrderHosp(UUID id, String titleOS, String description, OrderStatusQuery orderStatusQuery,
            ConsultationPriority consultationPriority, Users user) {
        this.id = id;
        this.titleOS = titleOS;
        this.description = description;
        this.orderStatusQuery = orderStatusQuery;
        this.consultationPriority = consultationPriority;
        this.user = user;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getTitleOS() {
        return titleOS;
    }

    public void setTitleOS(String titleOS) {
        this.titleOS = titleOS;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OrderStatusQuery getOrderStatusQuery() {
        return orderStatusQuery;
    }

    public void setOrderStatusQuery(OrderStatusQuery orderStatusQuery) {
        this.orderStatusQuery = orderStatusQuery;
    }

    public ConsultationPriority getConsultationPriority() {
        return consultationPriority;
    }

    public void setConsultationPriority(ConsultationPriority consultationPriority) {
        this.consultationPriority = consultationPriority;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ServiceOrderHosp other = (ServiceOrderHosp) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    

}
