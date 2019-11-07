require 'capybara'
require 'capybara/cucumber'
require 'selenium-webdriver'

Capybara.configure do |driver|
    driver.default_driver = :selenium_chrome
    driver.default_max_wait_time = 30
end    