WebElement submitButtonlProject = driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default primaryButton big colorPrimary ']"));

            submitButtonlProject.click();


            WebElement textProjectName = driver.findElement(By.xpath("//input[@class='ant-input primaryInput  not-entered']"));

            textProjectName.sendKeys("1Новый проект");
