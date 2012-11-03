// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dermotherlihy.quotation.model;

import com.dermotherlihy.quotation.model.Job;
import java.lang.Integer;
import java.lang.Long;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
import javax.persistence.Version;
import org.springframework.transaction.annotation.Transactional;

privileged aspect Job_Roo_Entity {
    
    declare @type: Job: @Entity;
    
    @PersistenceContext
    transient EntityManager Job.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Job.id;
    
    @Version
    @Column(name = "version")
    private Integer Job.version;
    
    public Long Job.getId() {
        return this.id;
    }
    
    public void Job.setId(Long id) {
        this.id = id;
    }
    
    public Integer Job.getVersion() {
        return this.version;
    }
    
    public void Job.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void Job.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Job.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Job attached = Job.findJob(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Job.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Job.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Job Job.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Job merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager Job.entityManager() {
        EntityManager em = new Job().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Job.countJobs() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Job o", Long.class).getSingleResult();
    }
    
    public static List<Job> Job.findAllJobs() {
        return entityManager().createQuery("SELECT o FROM Job o", Job.class).getResultList();
    }
    
    public static Job Job.findJob(Long id) {
        if (id == null) return null;
        return entityManager().find(Job.class, id);
    }
    
    public static List<Job> Job.findJobEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Job o", Job.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
