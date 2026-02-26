<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Vending Machine Problem</title>
</head>
<body>
    <h1>Problem</h1>
    <p>
        A vending machine needs to manage different states, including <strong>Idle</strong>, <strong>ItemSelected</strong>, <strong>Dispensing</strong>, and <strong>OutOfOrder</strong>. Each state has specific rules and restrictions regarding allowed operations, and the vending machine has associated attributes like item inventory and balance.
    </p>

    <h2>Requirements</h2>

    <h3>Idle State</h3>
    <ul>
        <li>Allow item selection</li>
        <li>Disallow dispensing items and inserting coins</li>
    </ul>

    <h3>ItemSelected State</h3>
    <ul>
        <li>Allow inserting coins and dispensing items</li>
        <li>Disallow item selection</li>
    </ul>

    <h3>Dispensing State</h3>
    <ul>
        <li>Allow no operations</li>
        <li>Automatically transition back to the "Idle" state after dispensing is complete</li>
    </ul>

    <h3>OutOfOrder State</h3>
    <ul>
        <li>Disallow all operations</li>
    </ul>
</body>
</html>
