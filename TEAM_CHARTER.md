# Quantom Team Charter

## 1. Team Roles
* **Workflow Lead (Member 1):** Repository governance, branching model maintenance, and commit message enforcement.
* **Clean Standards Lead (Member 2):** Definition of coding styles, variable naming conventions, and linting standards.
* **Communication & SLA Lead (Member 3):** Management of internal protocols, meeting cadences, and Peer Review response times.
* **Architecture & Ignores Lead (Member 4):** Project directory structure, dependency management, and security/environment configuration.

## 2. Branching Model: Feature-Branch Workflow
We will use a centralized Feature-Branch model to ensure stable releases:
* **`main` Branch:** Protected. Holds production-ready code. No direct commits allowed.
* **`feature/` Branches:** All development must occur in branches named `feature/[task-name]`.
* **PR Requirement:** Every change must be submitted via a Pull Request (PR) and requires **two (2) peer approvals** before merging into `main`.

## 3. Commit Message Standards
To maintain a clean and searchable history, all commits must follow the **Conventional Commits** specification: `<type>(<scope>): <short description>`

### Types:
* **feat:** New feature addition.
* **fix:** Bug correction.
* **docs:** Changes to documentation.
* **style:** Formatting, missing semi-colons, whitespace (no code change).
* **refactor:** Restructuring code without changing behavior.
* **test:** Adding or updating tests.
* **chore:** Build process or auxiliary tool changes.

*Example: `feat(workflow): establish team roles and branching model`*