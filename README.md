# Common Models for OpenCDMP

**common-models** is a Java package that provides shared models and classes used across the **OpenCDMP** platform. These models standardize the data structures and communication between the various services and microservices that make up the OpenCDMP ecosystem.

## Overview

The **common-models** repository contains Java classes that are central to the functioning of the OpenCDMP platform. These models define the data structures used for plans, descriptions, file transformations, repository deposits, and other core features. By using these common models, services in OpenCDMP can maintain consistent communication, ensuring interoperability and data integrity.

## Key Models

### 1. `PlanModel.java`

This class defines the structure for a **Plan** used across OpenCDMP.

```java
public class PlanModel {

    private UUID id;
    private short version;
    private String label;
    private String description;
    private PlanAccessType accessType;
    private PlanStatus status;
    private UserModel creator;
    private PlanBlueprintModel planBlueprint;
    private PlanPropertiesModel properties;
    private List<EntityDoiModel> entityDois;
    private List<DescriptionModel> descriptions;
    private List<PlanUserModel> users;
    private List<PlanReferenceModel> references;
    private List<PlanDescriptionTemplateModel> descriptionTemplates;
    private FileEnvelopeModel pdfFile;
    private FileEnvelopeModel rdaJsonFile;
    private FileEnvelopeModel supportingFilesZip;
    private String previousDOI;
    private Instant finalizedAt;
    private Instant publicAfter;
    private Instant updatedAt;
    private Instant createdAt;
    private String language;

    // Getters and Setters...
}
```

### 2. `DescriptionModel.java`

This class represents the structure for Descriptions related to a Plan, typically providing detailed explanations of the content or components of the plan.

```java
public class DescriptionModel {

    private UUID id;
    private String label;
    private String description;
    private List<String> tags;
    private DescriptionStatus status;
    private DescriptionTemplateModel descriptionTemplate;
    private PlanModel plan;
    private UUID sectionId;
    private Instant createdAt;

    // Getters and Setters...
}
```

## How to Use

The **common-models** repository is a Maven project. To use it in your own OpenCDMP-related service, simply include it as a dependency in your Maven configuration.

### Maven Dependency

To add **common-models** to your project, include the following in your `pom.xml`:

<xml>
<dependency>
    <groupId>org.opencdmp</groupId>
    <artifactId>common-models</artifactId>
    <version>1.0.0</version>
</dependency>
</xml>

By including this dependency, your project will have access to all the common models shared across the OpenCDMP platform.

## Key Features

- **Consistency**: Ensures consistent data structures across services.
- **Reusability**: Common models are reusable across different microservices in the platform.
- **Interoperability**: Simplifies communication between different components of OpenCDMP.
- **Standardization**: Provides a standard approach for handling core concepts like plans, descriptions, file operations, and repository deposits.

## License

This repository is licensed under the [EUPL 1.2 License](LICENSE).

## Contact

For questions or support regarding this repository, please contact:

- **Email**: opencdmp at cite.gr
