Feature: Sales columns and Sales log in name visibilities
  Agile story: Verify there are 6 columns to see the quotations on the Sales page when the POS &
  sales managers login.

  @TC139
  Scenario: Verifying all the functions on Sales page
  When Manager will log in to page.
  Given Click to Sales tab on the top

     # parameterization
    Then Manager should see below quotations
    | Quotation Number|
    | Quotation Date|
    | Customer|
    | Salesperson |
    | Total|
    | Status|

    # Then Manager sees "Salesperson"

    Then Check if log in name appears on the corner


