@echo off
echo Select a shape: 
echo 1. Circle
echo 2. Triangle
echo 3. Quadrilateral
set /p choice="Enter your choice (1-3): "
if %choice% equ 1 (
    set /p radius="Enter the radius of the circle: "
    set /a area=3*%radius%*%radius%
    echo The area of the circle is %area%
) else if %choice% equ 2 (
    set /p side1="Enter the length of side 1: "
    set /p side2="Enter the length of side 2: "
    set /p side3="Enter the length of side 3: "
    rem Calculate area of triangle using Heron's formula
    set /a s=(%side1%+%side2%+%side3%)/2
    set /a area=sqrt(s*(s-%side1%)(s-%side2%)(s-%side3%))
    echo The area of the triangle is %area%
    rem Determine the type of triangle
    if %side1% equ %side2% if %side2% equ %side3% (
        echo The triangle is equilateral
    ) else if %side1% equ %side2% if %side2% neq %side3% (
        echo The triangle is isosceles
    ) else (
        echo The triangle is scalene
    )
) else if %choice% equ 3 (
    set /p length="Enter the length of the quadrilateral: "
    set /p width="Enter the width of the quadrilateral: "
    set /a area=%length%*%width%
    echo The area of the quadrilateral is %area%
    if %length% equ %width% (
        echo The quadrilateral