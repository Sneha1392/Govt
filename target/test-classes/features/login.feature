Feature: GovtTech Login
  Scenario Outline: User fills up Application forms
    Given user opens the GovtTech URL with "<Username>" and "<Password>"
    And User logs in to corpass with "<NRIC>" and "<name>" and "<UEN>" and "<Role>"
    And User clicks on My Grants and Get new Grant with "<Menu>" and "<SubMenu>"
    And User selects "<sector>"
    And User selects the "<grant>"
    And User applies for "<Marketgrant>"
    And user fills up Application form with "<q1>" and "<q2>" and "<q3>" and "<q4>" and "<q5>"



  Examples:
  |Username| Password| NRIC |  name | UEN | Role | Menu | SubMenu | sector | grant | Marketgrant |q1|q2|q3|q4|q5|
  |public  |  Let$BeC001       | G3267797W| Sneha Shah |T12LL1368D  | Acceptor | Dashboard| Get new grant| IT| International Expansion| Market Readiness Assistance|react-eligibility-sg_registered_check|react-eligibility-turnover_check | react-eligibility-global_hq_check|react-eligibility-new_target_market_check | react-eligibility-started_project_check|

  Scenario Outline: User fills up invalid email in Contact Details form
    Given user opens the GovtTech URL with "<Username>" and "<Password>"
    And User logs in to corpass with "<NRIC>" and "<name>" and "<UEN>" and "<Role>"
    And User clicks on My Grants and Get new Grant with "<Menu>" and "<SubMenu>"
    And User selects "<sector>"
    And User selects the "<grant>"
    And User applies for "<Marketgrant>"
    And user fills up Application form with "<q1>" and "<q2>" and "<q3>" and "<q4>" and "<q5>"
    And User clicks on Next Button
    And User enters invalid email


    Examples:
      |Username| Password| NRIC |  name | UEN | Role | Menu | SubMenu | sector | grant | Marketgrant |q1|q2|q3|q4|q5|
      |public  |  Let$BeC001       | G3267797W| Sneha Shah |T12LL1368D  | Acceptor | Dashboard| Get new grant| IT| International Expansion| Market Readiness Assistance|react-eligibility-sg_registered_check|react-eligibility-turnover_check | react-eligibility-global_hq_check|react-eligibility-new_target_market_check | react-eligibility-started_project_check|


  Scenario Outline: User fills up invalid phone no in Contact Details form
    Given user opens the GovtTech URL with "<Username>" and "<Password>"
    And User logs in to corpass with "<NRIC>" and "<name>" and "<UEN>" and "<Role>"
    And User clicks on My Grants and Get new Grant with "<Menu>" and "<SubMenu>"
    And User selects "<sector>"
    And User selects the "<grant>"
    And User applies for "<Marketgrant>"
    And user fills up Application form with "<q1>" and "<q2>" and "<q3>" and "<q4>" and "<q5>"
    And User clicks on Next Button
    And User enters invalid phone number


    Examples:
      |Username| Password| NRIC |  name | UEN | Role | Menu | SubMenu | sector | grant | Marketgrant |q1|q2|q3|q4|q5|
      |public  |  Let$BeC001       | G3267797W| Sneha Shah |T12LL1368D  | Acceptor | Dashboard| Get new grant| IT| International Expansion| Market Readiness Assistance|react-eligibility-sg_registered_check|react-eligibility-turnover_check | react-eligibility-global_hq_check|react-eligibility-new_target_market_check | react-eligibility-started_project_check|

  Scenario Outline: User misses mandatory fields in Contact Details form
    Given user opens the GovtTech URL with "<Username>" and "<Password>"
    And User logs in to corpass with "<NRIC>" and "<name>" and "<UEN>" and "<Role>"
    And User clicks on My Grants and Get new Grant with "<Menu>" and "<SubMenu>"
    And User selects "<sector>"
    And User selects the "<grant>"
    And User applies for "<Marketgrant>"
    And user fills up Application form with "<q1>" and "<q2>" and "<q3>" and "<q4>" and "<q5>"
    And User clicks on Next Button
    And User does not enter mandatory field values


    Examples:
      |Username| Password| NRIC |  name | UEN | Role | Menu | SubMenu | sector | grant | Marketgrant |q1|q2|q3|q4|q5|
      |public  |  Let$BeC001       | G3267797W| Sneha Shah |T12LL1368D  | Acceptor | Dashboard| Get new grant| IT| International Expansion| Market Readiness Assistance|react-eligibility-sg_registered_check|react-eligibility-turnover_check | react-eligibility-global_hq_check|react-eligibility-new_target_market_check | react-eligibility-started_project_check|


  Scenario Outline: User fills up contact details
    Given user opens the GovtTech URL with "<Username>" and "<Password>"
    And User logs in to corpass with "<NRIC>" and "<name>" and "<UEN>" and "<Role>"
    And User clicks on My Grants and Get new Grant with "<Menu>" and "<SubMenu>"
    And User selects "<sector>"
    And User selects the "<grant>"
    And User applies for "<Marketgrant>"
    And user fills up Application form with "<q1>" and "<q2>" and "<q3>" and "<q4>" and "<q5>"
    And User clicks on Next Button
    And User fills up contact details form


    Examples:
      |Username| Password| NRIC |  name | UEN | Role | Menu | SubMenu | sector | grant | Marketgrant |q1|q2|q3|q4|q5|
      |public  |  Let$BeC001       | G3267797W| Sneha Shah |T12LL1368D  | Acceptor | Dashboard| Get new grant| IT| International Expansion| Market Readiness Assistance|react-eligibility-sg_registered_check|react-eligibility-turnover_check | react-eligibility-global_hq_check|react-eligibility-new_target_market_check | react-eligibility-started_project_check|

  Scenario Outline: User fills up contact details with autofill mailing address
    Given user opens the GovtTech URL with "<Username>" and "<Password>"
    And User logs in to corpass with "<NRIC>" and "<name>" and "<UEN>" and "<Role>"
    And User clicks on My Grants and Get new Grant with "<Menu>" and "<SubMenu>"
    And User selects "<sector>"
    And User selects the "<grant>"
    And User applies for "<Marketgrant>"
    And user fills up Application form with "<q1>" and "<q2>" and "<q3>" and "<q4>" and "<q5>"
    And User clicks on Next Button
    And User fills up contact details form with autofill mailing address


    Examples:
      |Username| Password| NRIC |  name | UEN | Role | Menu | SubMenu | sector | grant | Marketgrant |q1|q2|q3|q4|q5|
      |public  |  Let$BeC001       | G3267797W| Sneha Shah |T12LL1368D  | Acceptor | Dashboard| Get new grant| IT| International Expansion| Market Readiness Assistance|react-eligibility-sg_registered_check|react-eligibility-turnover_check | react-eligibility-global_hq_check|react-eligibility-new_target_market_check | react-eligibility-started_project_check|

  Scenario Outline: User fills up letter of offer form
    Given user opens the GovtTech URL with "<Username>" and "<Password>"
    And User logs in to corpass with "<NRIC>" and "<name>" and "<UEN>" and "<Role>"
    And User clicks on My Grants and Get new Grant with "<Menu>" and "<SubMenu>"
    And User selects "<sector>"
    And User selects the "<grant>"
    And User applies for "<Marketgrant>"
    And user fills up Application form with "<q1>" and "<q2>" and "<q3>" and "<q4>" and "<q5>"
    And User clicks on Next Button
    And User fills up contact details form
    And user fills up letter of form section


    Examples:
      |Username| Password| NRIC |  name | UEN | Role | Menu | SubMenu | sector | grant | Marketgrant |q1|q2|q3|q4|q5|
      |public  |  Let$BeC001       | G3267797W| Sneha Shah |T12LL1368D  | Acceptor | Dashboard| Get new grant| IT| International Expansion| Market Readiness Assistance|react-eligibility-sg_registered_check|react-eligibility-turnover_check | react-eligibility-global_hq_check|react-eligibility-new_target_market_check | react-eligibility-started_project_check|

  Scenario Outline: User fills up letter of offer form and selects same as main person
    Given user opens the GovtTech URL with "<Username>" and "<Password>"
    And User logs in to corpass with "<NRIC>" and "<name>" and "<UEN>" and "<Role>"
    And User clicks on My Grants and Get new Grant with "<Menu>" and "<SubMenu>"
    And User selects "<sector>"
    And User selects the "<grant>"
    And User applies for "<Marketgrant>"
    And user fills up Application form with "<q1>" and "<q2>" and "<q3>" and "<q4>" and "<q5>"
    And User clicks on Next Button
    And User fills up contact details form
    And user fills up letter of form section and selects same as main contact


    Examples:
      |Username| Password| NRIC |  name | UEN | Role | Menu | SubMenu | sector | grant | Marketgrant |q1|q2|q3|q4|q5|
      |public  |  Let$BeC001       | G3267797W| Sneha Shah |T12LL1368D  | Acceptor | Dashboard| Get new grant| IT| International Expansion| Market Readiness Assistance|react-eligibility-sg_registered_check|react-eligibility-turnover_check | react-eligibility-global_hq_check|react-eligibility-new_target_market_check | react-eligibility-started_project_check|

  Scenario Outline: User fills up proposal form
    Given user opens the GovtTech URL with "<Username>" and "<Password>"
    And User logs in to corpass with "<NRIC>" and "<name>" and "<UEN>" and "<Role>"
    And User clicks on My Grants and Get new Grant with "<Menu>" and "<SubMenu>"
    And User selects "<sector>"
    And User selects the "<grant>"
    And User applies for "<Marketgrant>"
    And user fills up Application form with "<q1>" and "<q2>" and "<q3>" and "<q4>" and "<q5>"
    And User clicks on Next Button
    And User fills up contact details form
    And User clicks on Next Button
    And user fills up proposal section
    And User clicks on Next Button


    Examples:
      |Username| Password| NRIC |  name | UEN | Role | Menu | SubMenu | sector | grant | Marketgrant |q1|q2|q3|q4|q5|
      |public  |  Let$BeC001       | G3267797W| Sneha Shah |T12LL1368D  | Acceptor | Dashboard| Get new grant| IT| International Expansion| Market Readiness Assistance|react-eligibility-sg_registered_check|react-eligibility-turnover_check | react-eligibility-global_hq_check|react-eligibility-new_target_market_check | react-eligibility-started_project_check|

  Scenario Outline: User fills up business impact form
    Given user opens the GovtTech URL with "<Username>" and "<Password>"
    And User logs in to corpass with "<NRIC>" and "<name>" and "<UEN>" and "<Role>"
    And User clicks on My Grants and Get new Grant with "<Menu>" and "<SubMenu>"
    And User selects "<sector>"
    And User selects the "<grant>"
    And User applies for "<Marketgrant>"
    And user fills up Application form with "<q1>" and "<q2>" and "<q3>" and "<q4>" and "<q5>"
    And User clicks on Next Button
    And User fills up contact details form
    And User clicks on Next Button
    And user fills up proposal section
    And User clicks on Next Button
    And user fills up business impact section
    And User clicks on Next Button


    Examples:
      |Username| Password| NRIC |  name | UEN | Role | Menu | SubMenu | sector | grant | Marketgrant |q1|q2|q3|q4|q5|
      |public  |  Let$BeC001       | G3267797W| Sneha Shah |A12LL1368E  | Acceptor | Dashboard| Get new grant| IT| International Expansion| Market Readiness Assistance|react-eligibility-sg_registered_check|react-eligibility-turnover_check | react-eligibility-global_hq_check|react-eligibility-new_target_market_check | react-eligibility-started_project_check|

  Scenario Outline: User checks errors in the form
    Given user opens the GovtTech URL with "<Username>" and "<Password>"
    And User logs in to corpass with "<NRIC>" and "<name>" and "<UEN>" and "<Role>"
    And User clicks on My Grants and Get new Grant with "<Menu>" and "<SubMenu>"
    And User selects "<sector>"
    And User selects the "<grant>"
    And User applies for "<Marketgrant>"
    And user fills up Application form with "<q1>" and "<q2>" and "<q3>" and "<q4>" and "<q5>"
    And User clicks on Next Button
    And User fills up contact details form
    And User clicks on Next Button
    And user fills up proposal section
    And User clicks on Next Button
    And user fills up business impact section
    And User clicks on Next Button
    And User provides details of cost
    And User clicks on Next Button
    And User reviews the form
    And User verifies the errors in form


    Examples:
      |Username| Password| NRIC |  name | UEN | Role | Menu | SubMenu | sector | grant | Marketgrant |q1|q2|q3|q4|q5|
      |public  |  Let$BeC001       | G3267797W| Sneha Shah |A12LL1368E  | Acceptor | Dashboard| Get new grant| IT| International Expansion| Market Readiness Assistance|react-eligibility-sg_registered_check|react-eligibility-turnover_check | react-eligibility-global_hq_check|react-eligibility-new_target_market_check | react-eligibility-started_project_check|

  @BGP
  Scenario Outline: User submits the application and reviews submission
    Given user opens the GovtTech URL with "<Username>" and "<Password>"
    And User logs in to corpass with "<NRIC>" and "<name>" and "<UEN>" and "<Role>"
    And User clicks on My Grants and Get new Grant with "<Menu>" and "<SubMenu>"
    And User selects "<sector>"
    And User selects the "<grant>"
    And User applies for "<Marketgrant>"
    And user fills up Application form with "<q1>" and "<q2>" and "<q3>" and "<q4>" and "<q5>"
    And User clicks on Next Button
    And User fills up contact details form
    And User clicks on Next Button
    And user fills up proposal section
    And User clicks on Next Button
    And user fills up business impact section
    And User clicks on Next Button
    And User provides details of cost
    And User clicks on Next Button
    And User reviews the form
    And User verifies the errors in form
    And User reviews submission


    Examples:
      |Username| Password| NRIC |  name | UEN | Role | Menu | SubMenu | sector | grant | Marketgrant |q1|q2|q3|q4|q5|
      |public  |  Let$BeC001       | G3267797W| Sneha Shah |A12LL1368E  | Acceptor | Dashboard| Get new grant| IT| International Expansion| Market Readiness Assistance|react-eligibility-sg_registered_check|react-eligibility-turnover_check | react-eligibility-global_hq_check|react-eligibility-new_target_market_check | react-eligibility-started_project_check|
