# falchionpatch-1.20.1 (GitHub-ready)

This repository is ready to push to GitHub. The included GitHub Actions workflow will compile the mod using Gradle and upload the resulting jar as an artifact.

## What's included
- Source code for the patch mod (`src/main/java/...`)
- `build.gradle`, `settings.gradle`
- `libs/epicfight-forge-20.12.5-1.20.1.jar` (present).
- GitHub Actions workflow at `.github/workflows/build.yml` (runs on push to `main` or manual dispatch).

## How to use
1. (If missing) Put `epicfight-forge-20.12.5-1.20.1.jar` into the `libs/` folder.
2. Create a GitHub repo named `falchionpatch-1.20.1` and push this project to `main`:
```bash
git init
git branch -M main
git remote add origin https://github.com/<TU_USUARIO>/falchionpatch-1.20.1.git
git add .
git commit -m "Initial commit - Falchion patch"
git push -u origin main
```
3. Go to Actions → select the workflow run → after it completes download the artifact `falchionpatch-jar`.

## Notes
- If GitHub Actions fails to find `epicfight` jar, upload it to `libs/` and push again.
- The build uses Gradle; the Gradle Action will download an appropriate Gradle version automatically.
