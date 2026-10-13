# OpenCDMP common models

**common-models** is the Java library with the data models that [OpenCDMP](https://github.com/OpenCDMP/OpenCDMP) and its plugins exchange. When the platform asks a file transformer to export a plan, a deposit service to publish one, or an evaluator to check one, it sends these models, and the plugin returns them.

The models cover plans, descriptions, plan blueprints, description templates, references, users, files, plugin configuration, deposit previews, and semantics manifests.

**Documentation**: [Common models](https://opencdmp.github.io/developers/plugins/common-models/)

## Requirements

- Java 21 or later
- Maven

## What the package contains

All classes are under `org.opencdmp.commonmodels`:

| Package | Contents |
| --- | --- |
| `models` | Shared classes such as `FileEnvelopeModel` (a file passed between services), `EntityDoiModel`, `PlanUserModel`, `TagModel`, and `ConfigurationField` (a configuration field that a plugin declares) |
| `models.plan` | `PlanModel`, its status, properties, and contacts |
| `models.description` | `DescriptionModel`, its status, and its answers |
| `models.planblueprint`, `models.descriptiotemplate`, `models.plandescriptiontemplate` | Plan blueprints, description templates, and the description templates a plan uses in each section |
| `models.planblueprintdescriptiontemplatefields`, `models.plandescriptionfields` | The questions of a template and the answers to them |
| `models.reference`, `models.referencetype`, `models.planreference` | References (funders, grants, licences, and so on) and their types |
| `models.user` | Users and their contact details |
| `models.plugin` | The values set for a plugin's configuration fields on a blueprint or asset template, and by a user |
| `models.deposit` | The deposit preview and metadata review contract |
| `models.semantics` | The semantics manifest |
| `enums` | Statuses, roles, field types, and the other enumerations |

## Use it in a plugin

Plugins usually get common-models through their base library: [`file-transformer-base`](https://github.com/OpenCDMP/file-transformer-base), [`repository-deposit-base`](https://github.com/OpenCDMP/repository-deposit-base), or [`evaluator-base`](https://github.com/OpenCDMP/evaluator-base). To depend on it directly:

```xml
<dependency>
    <groupId>org.opencdmp</groupId>
    <artifactId>common-models</artifactId>
    <version>X.Y.Z</version>
</dependency>
```

Releases are on [Maven Central](https://central.sonatype.com/artifact/org.opencdmp/common-models). Use the version that your plugin base library depends on.

## Build from source

```bash
mvn clean install
```

This installs version `1.0.0-SNAPSHOT` in your local Maven repository. To install another version, set it first with `mvn versions:set -DnewVersion=<version>`.

## Related resources

- [Common models](https://opencdmp.github.io/developers/plugins/common-models/): every class and field
- [Plugin development](https://opencdmp.github.io/developers/plugins/): [file transformers](https://opencdmp.github.io/developers/plugins/file-transformers/), [deposit services](https://opencdmp.github.io/developers/plugins/deposit/), [deposit preview](https://opencdmp.github.io/developers/plugins/deposit-preview/), and [evaluators](https://opencdmp.github.io/developers/plugins/evaluator/)
- [Run a plugin locally](https://opencdmp.github.io/developers/plugins/run-locally/)
- [OpenCDMP](https://github.com/OpenCDMP/OpenCDMP)

## Contributing

Report bugs and suggest changes in [GitHub Issues](https://github.com/OpenCDMP/common-models/issues). See [Contributing](https://opencdmp.github.io/developers/contributing/) for how to propose a change.

## License

common-models is licensed under the [European Union Public Licence (EUPL) v1.2](LICENSE).

## Contact

Questions: email opencdmp at cite.gr.
