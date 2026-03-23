# Common Models for OpenCDMP

**common-models** is a Java package that provides shared models and classes used across the **OpenCDMP** platform. These models standardize the data structures and communication between the various services and microservices that make up the OpenCDMP ecosystem.

---

## Overview

The **common-models** repository contains Java classes that are central to the functioning of the OpenCDMP platform. These models define the data structures used for Plans, Descriptions, file transformations, repository deposits, and evaluators. By using these common models, services in OpenCDMP can maintain consistent communication, ensuring interoperability and data integrity.

For detailed information about OpenCDMP architecture and concepts, see the [official documentation](https://opencdmp.github.io/developers/plugins/common-models/).

---

## Key Models

### 1. `PlanModel.java`

This class defines the structure for a **Plan** used across OpenCDMP. 

**Documentation**: [Plans User Guide](https://opencdmp.github.io/user-guide/plans/)

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

**Documentation**: [Descriptions User Guide](https://opencdmp.github.io/user-guide/descriptions/)

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
    private PropertyDefinitionModel properties;
    private List<VisibilityStateModel> visibilityStates;

    // Getters and Setters...
}
```

----

## Usages

### 1. File Transformation Models

Models used for pluggable export and import operations (XML, JSON, DOCX, PDF).

**Documentation**: [File Transformation Service](https://opencdmp.github.io/optional-services/file-transformers/)

### 2. Repository Deposit Models

Models used for depositing Plans to external repositories and assigning DOIs.

**Documentation**: [Repository Deposit Service](https://opencdmp.github.io/optional-services/deposit-services/)


### 3. Evaluator Models

Models used for validation and evaluation logic within Plans and Descriptions.

**Documentation**: [Evaluators](https://opencdmp.github.io/optional-services/evaluator-services/)

----

## How to Use

The **common-models** repository is a Maven project. To use it in your own OpenCDMP-related service, include it as a dependency in your Maven configuration.

### Maven Dependency

To add **common-models** to your project, include the following in your `pom.xml`:

```xml
<dependency>
    <groupId>org.opencdmp</groupId>
    <artifactId>common-models</artifactId>
    <version>1.2.0</version>
</dependency>
```

By including this dependency, your project will have access to all the common models shared across the OpenCDMP platform.

----

## Key Features

- **Consistency**: Ensures consistent data structures across services
- **Reusability**: Common models are reusable across different microservices in the platform
- **Interoperability**: Simplifies communication between different components of OpenCDMP
- **Standardization**: Provides a standard approach for handling core concepts like Plans, Descriptions, file operations, and repository deposits
- **Type Safety**: Strongly typed Java models prevent runtime errors

---

## Related Resources

- **Main Repository**: [OpenCDMP](https://github.com/OpenCDMP/OpenCDMP)
- **Documentation**: [OpenCDMP Documentation](https://opencdmp.github.io/)
- **Plugins Developer Integration**: [Integration Guide](https://opencdmp.github.io/developers/plugins/)
---

## License 

This repository is licensed under the [EUPL 1.2 License](LICENSE).

---

## Contact

For questions or support regarding this repository, please contact:

- **Email**: opencdmp at cite.gr

---

*This package is part of the OpenCDMP ecosystem. For general OpenCDMP documentation, visit [opencdmp.github.io](https://opencdmp.github.io).*
