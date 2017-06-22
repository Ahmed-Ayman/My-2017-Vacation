"""
this program uses twilio library to send text message for your mobile
"""
from twilio import rest

# Your Account SID from twilio.com/console
account_sid = "ACb1ccafdd30dfbe090241d3e223c944b9"
# Your Auth Token from twilio.com/console
auth_token  = "769237828cbc4ab2ede45dfb8b03af1c"

client = rest.Client(account_sid, auth_token)

message = client.messages.create(
    to="+201152135068",
    from_="+18582957348",
    body="Hello from Python! My name is  Ahmed Ayman!")

print(message.sid)
