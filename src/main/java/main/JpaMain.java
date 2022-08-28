package main;

import domain.Member;
import valuetype.Address;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args) {

        System.out.println("testestststsetset");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            Member member = new Member();
            member.getHobbies().add("헬스");
            member.getHobbies().add("코딩");

            member.getAddressHistory().add(new Address("서울","연희동","202번지"));
            member.getAddressHistory().add(new Address("인천","마전동","105번지"));

            em.persist(member);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }

//    public static void logic(EntityManager em) {
//        String id = "id1";
//        Member member = new Member();
//        member.setId(id);
//        member.setName("테스트");
//        member.setAge(12);
//
//        em.persist(member);
//
//        member.setAge(15);
//
//        Member findMember = em.find(Member.class, id);
//
//        List<Member> members =
//                em.createQuery("select m from Member m", Member.class).getResultList();
//
//        em.remove(member);
//    }
}
