

Chapter 1: Securing DevOps
   
            1.1 The DevOps approach
                1.1.1 Continuous integration
                1.1.2 Continuous delivery
                1.1.3 Infrastructure as a service
                1.1.4 Culture and trust
            1.2 Security in DevOps
            1.3 Continuous security
                1.3.1 Test-driven security
                1.3.2 Monitoring and responding to attacks
                1.3.3 Assessing risks and maturing security
      
Part 1: Case Study: Applying Layers Of Security To A Simple DevOps Pipeline
   

Chapter 2: Building a barebones DevOps pipeline
            
            2.1 Implementation roadmap
            2.2 The code repository: GitHub
            2.3 The CI platform: CircleCI
            2.4 The container repository: Docker Hub
            2.5 The production infrastructure: Amazon Web Services
                2.5.1 Three-tier architecture
                2.5.2 Configuring access to AWS
                2.5.3 Virtual Private Cloud
                2.5.4 Creating the database tier
                2.5.5 Creating the first two tiers with Elastic Beanstalk
                2.5.6 Deploying the container onto your systems
            2.6 A rapid security audit
      
Chapter 3: Security layer 1: protecting web applications
   
            3.1 Securing and testing web apps
            3.2 Website attacks and content security
                3.2.1 Cross-site scripting and Content Security Policy
                3.2.2 Cross-site request forgery
                3.2.3 Clickjacking and IFrames protection
            3.3 Methods for authenticating users
                3.3.1 HTTP basic authentication
                3.3.2 Password management
                3.3.3 Identity providers
                3.3.4 Sessions and cookie security
                3.3.5 Testing authentication
            3.4 Managing dependencies
                3.4.1 Golang vendoring
                3.4.2 Node.js package management
                3.4.3 Python requirements
      
Chapter 4: Security layer 2: protecting cloud infrastructures
   
            4.1 Securing and testing cloud infrastructure: the deployer
                4.1.1 Setting up the deployer
                4.1.2 Configuration notifications between Docker Hub and the deployer
                4.1.3 Running tests against the infrastructure
                4.1.4 Updating the invoicer environment
            4.2 Restricting network access
                4.2.1 Testing security groups
                4.2.2 Opening access between security groups
            4.3 Building a secure entry point
                4.3.1 Generating SSH keys
                4.3.2 Creating a bastion host in EC2
                4.3.3 Enabling two-factor authentication with SSH
                4.3.4 Sending notifications on accesses
                4.3.5 General security considerations
                4.3.6 Opening access between security groups
            4.4 Controlling access to the database
                4.4.1 Analyzing the database structure
                4.4.2 Roles and permissions in PostgreSQL
                4.4.3 Defining fine-grained permissions for the invoicer application
                4.4.4 Asserting permissions in the deployer
      
Chapter 5: Security layer 3: securing communications
   
            5.1 What does it mean to secure communications?
                5.1.1 Early symmetric cryptography
                5.1.2 Diffie-Hellman and RSA
                5.1.3 Public-key infrastructures
                5.1.4 SSL and TLS
            5.2 Understanding SSL/TLS
                5.2.1 The certificate chain
                5.2.2 The TLS handshake
                5.2.3 Perfect forward secrecy
            5.3 Getting applications to use HTTPS
                5.3.1 Obtaining certificates from AWS
                5.3.2 Obtaining certificates from Let’s Encrypt
                5.3.3 Enabling HTTPS on AWS ELB
            5.4 Modernizing HTTPS
                5.4.1 Testing TLS
                5.4.2 Implementing Mozilla’s Modern guidelines
                5.4.3 HSTS: Strict Transport Security
                5.4.4 HPKP: Public Key Pinning
      
Chapter 6: Security layer 4: securing the delivery pipeline
   
            6.1 Access control to code-management infrastructure
                6.1.1 Managing permissions in a GitHub organization
                6.1.2 Managing permissions between GitHub and CircleCI
                6.1.3 Signing commits and tags with Git
            6.2 Access control for container storage
                6.2.1 Managing permissions between Docker Hub and CircleCI
                6.2.2 Signing containers with Docker Content Trust
            6.3 Access control for infrastructure management
                6.3.1 Managing permissions using AWS roles and policies
                6.3.2 Distributing secrets to production systems
      
Part 2: Watching For Anomalies And Protecting Services Against Attacks
   
Chapter 7: Collecting and storing logs
   
            7.1 Collecting logs from systems and applications
                7.1.1 Collecting logs from systems
                7.1.2 Collecting application logs
                7.1.3 Infrastructure logging
                7.1.4 Collecting logs from GitHub
            7.2 Streaming log events through message brokers
            7.3 Processing events in log consumers
            7.4 Storing and archiving logs
            7.5 Accessing logs
      
Chapter 8: Analyzing logs for fraud and attacks
   
            8.1 Architecture of a log-analysis layer
            8.2 Detecting attacks using string signatures
            8.3 Statistical models for fraud detection
                8.3.1 Sliding windows and circular buffers
                8.3.2 Moving averages
            8.4 Using geographic data to find abuses
                8.4.1 Geoprofiling users
                8.4.2 Calculating distances
                8.4.3 Finding a user’s normal connection area
            8.5 Detecting anomalies in known patterns
                8.5.1 User-agent signature
                8.5.2 Anomalous browser
                8.5.3 Interaction patterns
            8.6 Raising alerts to operators and end users
                8.6.1 Escalating security events to operators
                8.6.2 How and when to notify end users
        
Chapter 9: Detecting intrusions
   
            9.1 The seven phases of an intrusion: the kill chain
            9.2 What are indicators of compromise?
            9.3 Scanning endpoints for IOCs
            9.4 Inspecting network traffic with Suricata
                9.4.1 Setting up Suricata
                9.4.2 Monitoring the network
                9.4.3 Writing rules
                9.4.4 Using predefined rule-sets
            9.5 Finding intrusions in system-call audit logs
                9.5.1 The execution vulnerability
                9.5.2 Catching fraudulent executions
                9.5.3 Monitoring the filesystem
                9.5.4 Monitoring the impossible
                9.6 Trusting humans to detect anomalies
      
Chapter 10: The Caribbean breach: a case study in incident response
   
            10.1 The Caribbean breach
            10.2 Identification
            10.3 Containment
            10.4 Eradication
                10.4.1 Capturing digital forensics artifacts in AWS
                10.4.2 Outbound IDS filtering
                10.4.3 Hunting IOCs with MIG
            10.5 Recovery
            10.6 Lessons learned and the benefits of preparation
      
Part 3: Maturing DevOps Security
   
Chapter 11: Assessing risks
   
            11.1 What is risk management?
            11.2 The CIA triad
                11.2.1 Confidentiality
                11.2.2 Integrity
                11.2.3 Availability
            11.3 Establishing the top threats to an organization
            11.4 Quantifying the impact of risks
                11.4.1 Finances
                11.4.2 Reputation
                11.4.3 Productivity
            11.5 Identifying threats and measuring vulnerability
                11.5.1 The STRIDE threat-modeling framework
                11.5.2 The DREAD threat-modeling framework
            11.6 Rapid risk assessment
                11.6.1 Gathering information
                11.6.2 Establishing a data dictionary
                11.6.3 Identifying and measuring risks
                11.6.4 Making recommendations
            11.7 Recording and tracking risks
                11.7.1 Accepting, rejecting, and delegating risks
                11.7.2 Revisiting risks regularly
        
Chapter 12: Testing security
   
            12.1 Maintaining security visibility
            12.2 Auditing internal applications and services
                12.2.1 Web-application scanners
                12.2.2 Fuzzing
                12.2.3 Static code analysis
                12.2.4 Auditing Cloud Infrastructure
            12.3 Red teams and external pen testing
            12.4 Bug bounty programs
      
Chapter 13: Continuous security
   
            13.1 Practice and repetition: 10,000 hours of security
            13.2 Year 1: integrating security into DevOps
                13.2.1 Don’t judge too early
                13.2.2 Test everything and make dashboards
            13.3 Year 2: preparing for the worst
                13.3.1 Avoid duplicating infrastructure
                13.3.2 Build versus buy
                13.3.3 Getting breached
            13.4 Year 3: driving the change
                13.4.1 Revisit security priorities
                13.4.2 Progressing iteratively