# custom-log-parser

A simple Java based tool to analyse server logs.


# Pre-requisites

|Tool| Version  |
|--|--|
| Java | 8 |
| Maven | >= 3.5.4 |


# Running

- Run `./mvnw compile` on Linux/macOS based platforms
  - **OR** Run `mvnw.bat compile` on Windows
- Enter the absolute path of the **logfile.txt**
- The program will continue to run indefinitely unless a wrong file path/extension is fed in the input
- Otherwise, press `Ctrl + C`  or `Cmd + C` to exit

# TL;DR

- Solution could utilse Java Persistance API
- Multi-threaded
- Supporting large files
