#!/usr/bin/env sh
set -e
DIR="$(cd "$(dirname "$0")" && pwd)"
exec "${DIR}/gradle/bin/gradle" "$@"
