@echo off
echo Select a command:
echo 1. ipconfig
echo 2. tasklist/taskkill
rem Add options for other commands
set /p command="Enter your choice (1-2): "
if %command% equ 1 (
    ipconfig
) else if %command% equ 2 (
    tasklist
    set /p kill="Do you want to kill a task? (Y/N): "
    if /i %kill% equ Y (
        set /p task="Enter the name of the task to kill: "
        taskkill /im %task%
    )
) else (
    echo Invalid choice
)
