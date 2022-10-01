package hellojpa;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");


        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
/*            Member findMember = em.find(Member.class,1L);
            System.out.println("findMember.id" + findMember.getId());
            System.out.println("findMember.name" + findMember.getName());
            findMember.setName("HelloJPA");*/

            Member member = em.find(Member.class, 150L);
            member.setName("ZZZZZ");


            System.out.println("==============");

            tx.commit(); //커밋할때 쿼리가 날라감

        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }
        emf.close();;
    }
}
