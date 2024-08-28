# DangerousZone
An implementation of Orespawn installer for Forge 1.12.2 and 1.7.10

### Doesn't it infringe copyright?
Not really. It only installs publicly available Orespawn jars with coremod.
None of the assets or code is redistributed.

### How to use the mod?
Just drop it in mods folder.

### Building from source
- Clone the repo with github-cli or git or install the zip and unzip it on a folder.
- Then use command line to build the mod like this:
```
cd path-to-unzipped-folder
gradlew build
```
- After building, the jars will be in `<unzipped-folder>/build/libs`

### Notice
Yeah this mod does connect to an URL to download a mod jar, BEWARE THAT IT INSTALLS A FILE FROM INTERNET.

The used links are,

for 1.12.2: `https://dangerzone-archive.weebly.com/orespawn.html`

for 1.7.10: `https://orespawn.fr/orespawn-1-7-10`
