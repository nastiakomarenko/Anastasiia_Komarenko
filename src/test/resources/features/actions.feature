Feature: Dropbox File Operations

  Scenario: Upload a File
    Given I have a file to upload
    When I upload the file to Dropbox
    Then the file should be successfully uploaded

  Scenario: Get File Metadata
    Given there is a file on Dropbox
    When I request metadata for the file
    Then I should receive the file metadata

  Scenario: Delete a File
    Given there is a file on Dropbox
    When I delete the file
    Then the file should be deleted from Dropbox
