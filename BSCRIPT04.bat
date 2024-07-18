@echo off
:: Sort text files on Drive C: by date
for %%f in (C:\*.txt) do (
    move "%%f" "C:\SortedFiles"
)
:: Archive older files to a folder on Drive Z:
forfiles /p "C:\SortedFiles" /s /m *.* /d -30 /c "cmd /c move @file Z:\Archive"
:: Sort the archived files by size
for /f "delims=" %%a in ('dir /b /os Z:\Archive\*.*') do (
    echo %%a
)
set /p delete="Do you want to delete the old, large files? (Y/N): "
if /i %delete% equ Y (
    del Z:\Archive\*.txt
)