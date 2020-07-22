# BDD Workshop

## Steps

* install ruby 1.9.3-p551
* update rubygems with `gem update --system`
* install gems `bundle install --without staging:production`

## Activities

* convert rspec feature tests to cucumber features

### Converting to cucumber

* Write feature
* Write scenario
* Run feature
* Steps will be skipped

* Read the output, giving hints on how to write steps
* Write steps
* Repeat

## Notes


BDD comes from TDD, which comes from XP.
The idea of acceptance test (from XP) is that the developers and the
stakeholders collaborate to write tests that describe the outcome that
the stakeholder wants.

> Acceptance tests help you build **the right thing**, unit tests to build **the thing right**

BDD formalizes TDD best practices, like:

* Outside-in testing: starting from the customer's perspective
* Focus on user stories, using concrete examples
* Focus on ubiquitous language (Gherkin)

### Advantages of BDD

* The Cucumber features become a "living documentation" (they don't go out of
date after having been written), and the *source of truth*.

* The code you write will be the minimum necessary to satisfy the required features.

* You will have a clear overview of what you want to do, *before* you start doing it.

### How to write a step

* Learn regular expressions:
  * groups, non-capturing groups
  * character classes: `[0-9]`, `[a-z]`, `[A-Z]`
  * shorthand classes: `\d`, `\w`, `\s`, `\b`
  * modifiers:         `*`, `+`, `?`
  * anchors:           `^`, `$`
* Groups create block variables
* Use `pending` when you're still working on the step

### Best practices

* Re-use steps. Cucumber will require all ruby files under the `features`
  directory, which means you can use steps defined in any file from any
  feature.
* Use plain ruby modules and methods to group together invocations to
  Capybara's helpers. This is much better than nesting steps.

``` ruby
        module LoginSteps
          def login(name, password)
            visit('/login')
            fill_in('User name', with: name)
            fill_in('Password',  with: password)
            click_button('Log in')
          end
        end
```

        World(LoginSteps)

* Keep your steps discursive, declarative and high-level. Avoid implementation details.

  Bad:

        Scenario: Successful login
          Given a user "Aslak" with password "xyz"
          And I am on the login page
          And I fill in "User name" with "Aslak"
          And I fill in "Password" with "xyz"
          When I press "Log in"
          Then I should see "Welcome, Aslak"
 
  Good:

        Scenario: Successful login
          Given the user "Aslak" has an account
          When he logs in
          Then he should see "Welcome, Aslak"

* Split your features and step definitions in subdirectories.
* Use `@tags`

## Links

### Cucumber

* <https://github.com/cucumber/cucumber/wiki/Cucumber-Backgrounder>

### JavaScript

* <https://github.com/modeset/teaspoon/wiki/Quick-Start-Walkthrough>

