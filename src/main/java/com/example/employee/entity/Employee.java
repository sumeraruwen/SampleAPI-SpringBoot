package com.example.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY )
      private int empID;
      private String empName;
      private String empAddress;
      private String empMNumber;

}
