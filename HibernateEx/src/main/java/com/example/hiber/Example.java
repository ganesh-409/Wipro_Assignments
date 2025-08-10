package com.example.hiber;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.util.HibernateUtil;
import com.ganesh.hibernateProject.Gender;
import com.ganesh.hibernateProject.School;

public class Example {
	public static void main(String[] args) {
		
		

Session session1 = HibernateUtil.getSessionFactory().openSession();
Transaction tx = session1.beginTransaction();
School school = new School("varun", "meghana", "meghana@gmail.com", Gender.MALE);
session1.persist(school);
tx.commit();
session1.close();
System.out.println("Data added successfully");

// 2️⃣ Fetch data
session1 = HibernateUtil.getSessionFactory().openSession();
School schoolData = session1.get(School.class, school.getGender());
System.out.println("Fetched: " + schoolData);
session1.close();

// 3️⃣ Update data
session1 = HibernateUtil.getSessionFactory().openSession();
tx = session1.beginTransaction();
schoolData.setEmail("swathi22@gmail.com");
session1.merge(schoolData);
tx.commit();
session1.close();
System.out.println("Update successful");

// 4️⃣ Delete data
session1 = HibernateUtil.getSessionFactory().openSession();
tx = session1.beginTransaction();
School toDelete = session1.get(School.class, school.getGender());
if (toDelete != null) {
    session1.remove(toDelete);
    System.out.println("Deleted: " + toDelete);
} else {
    System.out.println("No record found to delete");
}
tx.commit();
session1.close();
	}
}

