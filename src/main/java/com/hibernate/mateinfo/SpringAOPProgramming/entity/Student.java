package com.hibernate.mateinfo.SpringAOPProgramming.entity;

@XmlRootElement(name="Student")
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
    @XmlElement
    private  int id;
    private String name;
    private String email;
    private String address;

}
