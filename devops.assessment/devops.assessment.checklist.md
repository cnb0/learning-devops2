

## Checklist for a DevOps Engineer

Who is this guide for?
            Target Audience:
                • Senior/Lead DevOps Engineer
                • DevOps Manager
                • Director of Engineering
                • VP of Cloud Platforms
                • CTO
- Your team is responsible for ensuring faster application delivery. 
- You’re probably starting to adopt opensource tools that support the "shift left" in security best practices, as well as evaluating containerized and serverless architectures to deliver applications. 

- Your team’s responsibilities range from monitoring

- Performance and availability, to troubleshooting incidents and managing security and compliance.
- As your team grows, this guide will provide a well-defined framework to successfully onboard and 
  make a new DevOps/DevSecOps engineer productive within the first 90 days.


```
- Phase 1
   -  Gain an overview of the cloud-native landscape
       - Understand the Software Delivery Lifecycle (SDLC) framework and how code gets
         pushed to production (see appendix for cloud-native tool landscape).
       - Understand the application architecture.
               - Be aware of the application tech stack (e.g., Java, Go, Cassandra, Redis, etc.). 
                 This is  important to know even for non-developers.
               - Be aware of the technical debt in the engineering organization.
       - Be aware of container technologies used by your organization. Examples below:
                - Container runtimes: (e.g., Docker, crio, containerd, etc.)
                - Orchestrators: (e.g., Kubernetes, Red Hat OpenShift, Rancher, etc)
                - Cloud Providers (e.g., AWS, Azure, IBM etc) and managed Kubernetes services 
                  (ex. EKS, GKE, AKS etc)
                - Serverless frameworks: (ex. AWS Fargate, Google Cloud Run etc)


- Phase 2
       - Develop a strong grasp of the business initiatives and how they translate to cloud and        
         cloud-native project goals
       - Understand what applications are currently containerized in your environment and what
         is the next 6-18 month transformation plan to containers/Kubernetes 

- Phase 3
       - Align on shared goals with both internal and cross-functional stakeholders
           -  Make sure you shadow/spend time with the following:
                  -  DevOps teammates (shadow someone that is in charge of a production release)
                  -  Developers
                  -  Security team
                  -  Infrastructure operations
                  -  Product Managers
                  -  Vendor management and procurement

- Phase 4 
       - Get access to container monitoring and security tools
            - Monitoring tool access: Prometheus, Sysdig Monitor
                    Dig into what dashboards are currently used for visualization
                    Understand the alerting process
            - Security tool access: Falco, Open Policy Agent (OPA) Gatekeeper, Sysdig Secure




 - Understand the Current State  - 3 months
    - Phase 1 
            - Start taking on day-to-day responsibilities
              - Deliver features to production (e.g., bug fixes, minor changes/improvements, leveraging
                previous expertise to make prominent contributions to production).
              - Become an active participant during sprint planning and sizing, and aim to run at   least   one feature demo and/or brown bag (assuming these initiatives exist, if not, suggest starting regular lunch and learn sessions!).
              - Become heavily involved in day-to-day operations (e.g., ongoing health and maintenance
                of the container and K8s platform, bug fixes, upgrade/patch process, etc.).
              - Participate in design and strategy meetings, including:
                          - Improvements to overall infrastructure architecture
                          - Scaling systems (e.g., networking, applications, load balancers, etc.)
              - Regularly be on call/respond to outages.
              - Contribute to documentation.
              - Conduct peer review/code reviews on pull requests (PR)

