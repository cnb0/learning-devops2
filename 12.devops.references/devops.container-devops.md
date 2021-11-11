Modern Container-Based DevOps: Introduction

Module 1: Microservices Essentials Overview
       
            1: Understanding Microservices

                1.1 What are Microservices?
                1.2 Microservices and Containers: A Perfect Match
                1.3 Breaking up Monolithic Applications
                1.4 The role of RESTful API in Microservices
                1.5 The Role of CI/CD in Microservices
                1.6 DevOps and Microservices
                1.7 Understanding the Goals of this Course
                    1 Lab: Introducing the Course Microservice Project
       
            2: Using Git

                2.1 Using Git in a Microservices Environment
                2.2 Understanding Git
                2.3 Using Git Repositories
                2.4 Working with Branches
                2.5 Removing Files from Git Repositories
                    2 Lab: Setting up a Github Repository
                    2 Lab Solution: Setting up a Github Repository
       
            3: Understanding Containers

                3.1 What is a Container?
                3.2 Containers are Linux
                3.3 Understanding Why Containers Make Sense in a Microservices Approach
                3.4 Understanding Images and Containers
                3.5 Understanding Container Registries
                3.6 Taking a Docker Test-drive
                    3 Lab: Taking a Container Test-drive
                    3 Lab Solution: Taking a Container Test-drive

            4: Exploring the Container Landscape
            
                4.1 Understanding Container Origins
                4.2 Understanding Container Standardization
                4.3 Understanding Container Runtimes
                4.4 Understanding Container Orchestration
                    4 Lab: Running LXD Containers
                    4 Lab Solution: Running LXD Containers

Module 2: Managing Containers

            5: Getting Started with Docker

                5.1 Setting up Docker on Ubuntu or CentOS
                5.2 Running a Docker Container
                5.3 Verifying Container Availability
                5.4 Investigating Containers on the Host OS
                    5 Lab: Creating Stand Alone Docker Containers for the Course Project
                    5 Lab Solution: Creating Stand Alone Docker Containers for the Course Project

            6: Using Containers on RHEL 8

                6.1 Understanding RHEL 8 Container Solutions
                6.2 Managing Access to Registries
                6.3 Running Containers with Podman
                6.4 Managing Images with buildah
                    6 Lab: Creating Stand Alone Podman Containers for the Course Project
                    6 Lab Solution: Creating Stand Alone Podman Containers for the Course Project
            
            7: Performing Daily Container Management

                7.1 Running Containers
                7.2 Managing Containers Resource Limitations
                7.3 Inspecting Containers
                7.4 Managing Running Containers
                7.5 Connecting Containers
                    7 Lab: Managing the Course Project Containers
                    7 Lab Solution: Managing the Course Project Containers
            
            8: Managing Container Images

                8.1 Understanding Container Images
                8.2 Building Images with Dockerfile
                8.3 Building Images with docker commit
                8.4 Pushing Images to Registries
                8.5 Using Tags
                8.6 Creating Private Registries
                8.7 Automating Image Builds from Git Repositories
                    8 Lab: Automating Course Project Image Build from Git Repositories
                    8 Lab Solution: Automating Course Project Image Build from Git Repositories
            
            9: Managing Container Storage

                9.1 Understanding Container Storage
                9.2 Understanding Storage Drivers
                9.3 Using Bind Mount as Container Storage
                9.4 Using Volumes for Persistent Storage
                    9 Lab: Connecting the Course Project to Storage
                    9 Lab Solution: Connecting the Course Project to Storage
            
            10: Managing Container Networking

                10.1 Understanding Container Networking
                10.2 Understanding Bridge Networking
                10.3 Working with Default Bridge Networking
                10.4 Creating a Custom Bridge Network
                10.5 Understanding Microservices Container Networking Needs
                    10 Lab: Investigating Course Project Networking
                    10 Lab Solution: Investigating Course Project Networking

Module 3: Implementing Full Microservices with Container Orchestration Platforms

            11: The Role of Container Orchestration

                11.1 Understanding Enterprise Container Requirements
                11.2 Understanding Platform Requirements in a Microservice Architecture
                11.3 Exploring the Container Orchestration Landscape
                11.4 Understanding Kubernetes
                    11 Lab: Planning for Orchestration in the Course Project
                    11 Lab Solution: Planning for Orchestration in the Course Project

            12: Understanding Kubernetes

                12.1 Using Kubernetes in Minikube
                12.2 Using Kubernetes in Google Cloud
                12.3 Understanding Core Application Components in Kubernetes
                12.4 Running Containers through Pods and Deployments
                12.5 Understanding the Philosophy of Decoupling in a Microservices Context
                12.6 Using the kubectl Utility in Declarative or Imperative Mode
                12.7 Understanding the Kubernetes API
                12.8 Troubleshooting Kubernetes Applications
                    12 Lab: Running the Course Project in Kubernetes Deployments
                    12 Lab Solution: Running the Course Project in Kubernetes Deployments

            13: Creating Container-based Microservices in Kubernetes

                13.1 Feeding Images into Kubernetes
                13.2 Organizing Pod Storage
                13.3 Using Storage Provisioners
                13.4 Providing Flexible Parameters Using ConfigMaps and Secrets
                13.5 Exposing Applications Using Service Objects
                13.6 Providing Fixed DNS URLs Using Ingress
                13.7 Using Kustomize.yaml
                13.8 Understanding Istio Service Mesh
                13.9 Taking the Istio Testdrive
                    13 Lab: Implementing the Course Project as a Full Microservice on Kubernetes
                    13 Lab Solution: Implementing the Course Project as a Full Microservice on Kubernetes

