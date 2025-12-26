aws sqs create-queue \
  --queue-name payments-queue \
  --attributes DelaySeconds=10


aws sqs get-queue-attributes \
  --queue-url <QUEUE_URL> \
  --attribute-names All