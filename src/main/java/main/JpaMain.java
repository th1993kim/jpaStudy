package main;

import domain.Member;

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


        Member member;

        try {
            tx.begin();
            member = em.getReference(Member.class, 1L);
            System.out.println("============= em.find 호출 후  ==================");
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        System.out.println("member name = " + member.getName());
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
